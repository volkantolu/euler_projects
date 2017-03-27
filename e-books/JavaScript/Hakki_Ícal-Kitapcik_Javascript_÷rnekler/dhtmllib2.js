<!--
/* 
	DHTML Library Version 2.0b5
	Last Updated: March 29, 1999
	Copyright 1997-1999 by InsideDHTML.com, LLC

	This file cannot be redistributed or sold as part of any package without 
	explicit consent from Scott Isaacs - scott@insideDHTML.com
 
 	For more information on this library, see http://www.insideDHTML.com

	This library is provided AS IS WITHOUT WARRANTY OF ANY KIND AND ARE PROVIDED 
	WITHOUT ANY IMPLIED WARRANTY OF FITNESS FOR PURPOSE, MERCHANTABILITY, 
	OR NON-INFRINGEMENT. 

	Due to the variable nature of the different Internet Client Object Models there are
	no guarantees this library will work AS IS in future releases of any browser.

	Unless prior arrangements are made with scotti@insideDHTML.com, this file must be
	referenced as an external script by your web-pages. See the instructions for more 
	details.
         
	Registering 

	This library can be used on your web-site as long as you comply with the following requirements:
		1) The copyright notice and disclaimer must be maintained in the library file.
		2) You register your URL (or company with email address if non-public URL such as an intranet) 
		to DHTMLLibrary@insideDHTML.com. Please state if you DO NOT want your web-site or company
		listed as using this library (Your e-mail addresses will never be given out).
		3) You include a link back to InsideDHTML.com              

	Questions should be send to scotti@insideDHTML.com.
	See http://www.insideDHTML.com for more information.
  
	This comment must be maintained in the document unless prior arrangements are made 
	with scotti@insideDHTML.com.
*/

      
// Begin Library
var sys = navigator.appName;
var vers = parseInt(navigator.appVersion);
var n4 = document.layers
var ie4Mac = (vers>=4) && (navigator.appVersion.indexOf("Mac")>-1) && (!n4)


// Track property changes in Netscape

function testScroll() {
	// For onscroll event
	// Initialize scrollbar cache if necessary
	if (window._pageXOffset==null) {
		window._pageXOffset = window.pageXOffset
		window._pageYOffset = window.pageYOffset
	}
	// Expose Internet Explorer compatible object model
	document.body.unwatch("scrollTop") 
	document.body.unwatch("scrollLeft")
	document.body.scrollTop = window.pageYOffset
	document.body.scrollLeft = window.pageXOffset
	window.document.body.scrollHeight = document.height
	window.document.body.scrollWidth = document.width    
	document.body.watch("scrollTop",CheckScrollTop)
	document.body.watch("scrollLeft",CheckScrollLeft)

	document.body.clientWidth = window.innerWidth-20; 
	document.body.clientHeight = window.innerHeight-20;

	// If cache!=current values, call the onscroll event
	if (((window.pageXOffset!=window._pageXOffset) || (window.pageYOffset!=window._pageYOffset)) && (window.onscroll)) 
		window.onscroll()
	// Cache new values
	window._pageXOffset = window.pageXOffset
	window._pageYOffset = window.pageYOffset
}

function CheckScrollTop(prop,temp,newValue) {
	//window.pageYOffset = newValue
	return newValue	
}
function CheckScrollLeft(prop,temp,newValue) {
	//window.pageXOffset= newValue
	return newValue	
}

function CheckTopChange(prop,temp,newValue) {
	this.NSLayer.owningElement.offsetTop = this.NSLayer.top = newValue
	return newValue	
}

function CheckLeftChange(prop,temp,newValue) {
	this.NSLayer.owningElement.offsetLeft= this.NSLayer.left = newValue
	return newValue
}

function CheckWidthChange(prop,temp,newValue) {
	this.NSLayer.owningElement.offsetWidth = this.NSLayer.clip.width = newValue
	return newValue
}

function CheckHeightChange(prop,temp,newValue) {
	this.NSLayer.owningElement.offsetHeight = this.NSLayer.clip.height = newValue
	return newValue
}

function CheckColorChange(prop,temp,newValue) {
	this.NSLayer.bgColor = newValue
	return newValue
}

function CheckClipChange(prop,temp,newValue) {
	var sText = newValue.substring(5) 
	sText = sText.substring(0,sText.length-1)
	var aVal = sText.split(" ")
	this.NSLayer.clip.top = aVal[0]
	this.NSLayer.clip.width = aVal[1]
	this.NSLayer.clip.height = aVal[2]
	this.NSLayer.clip.left = aVal[3]
	return newValue
}

function CheckZIndexChange(prop,temp,newValue) {
	this.NSLayer.zIndex = newValue
	return newValue
}

function CheckContentChange(prop,temp,newValue) {
	this.NSLayer.document.open()
	this.NSLayer.document.write(newValue)
	this.NSLayer.document.close()
	this.NSLayer.document.owningElement = this.NSLayer.owningElement = this
	_extract(this.NSLayer, true)
	
	return newValue
}

function CheckVisibilityChange(prop,temp,newValue) {
	if (newValue=="hidden")
		this.NSLayer.visibility = "hide";
	else if (newValue=="visible")
		this.NSLayer.visibility = "show";
	else if (newValue=="inherit")
		this.NSLayer.visibility = "inherit";
	else
		this.NSLayer.visibility = "";
	return newValue
}

/* BEGIN CORE CODE TO BUILD OBJECT MODEL */


function _getInputTagName(type) {
	var sName
	if (type=="textarea")
		sName = "TEXTAREA"
	else if (type=="select-one")
		sName = "SELECT"
	else if (type=="select-multiple")
		sName = "SELECT"
	else
		sName = "INPUT"
	return sName
}

function _appendAll(obj, el, sName) {
	obj.all[sName] = el
	while (obj.offsetParent) {
		obj = obj.offsetParent
		obj.all[sName] = el
	}
}

function _extractRoot(obj, par) {
	for (var intLoop = 0; intLoop< obj.images.length; intLoop++) {
		var i = obj.images[intLoop]
		i.offsetParent = par
		i.offsetLeft = i.x
		i.offsetTop = i.y
		i.offsetWidth = i.width
		i.offsetHeight = i.height
		i.tagName = "IMG"
		if (""!=i.name) {
			window.document.all[i.name] = i
// window.document.images[i.name] = 
			if (obj.owningElement) _appendAll(obj.owningElement, i, i.name)
		}
	}

	for (var intLoop = 0; intLoop< obj.anchors.length; intLoop++) {
		var i = obj.anchors[intLoop]
		if (""!=i.name) {
			window.document.all[i.name] = i
			if (obj.owningElement) _appendAll(obj.owningElement, i, i.name)
		}
//			window.document.anchors[obj.anchors[intLoop].name] = obj.anchors[intLoop]
		obj.anchors[intLoop].offsetParent = par
	}


	for (var intLoop = 0; intLoop< obj.links.length; intLoop++) {
		obj.links[intLoop].innerText = obj.links[intLoop].text
		obj.links[intLoop].offsetParent = par
		obj.links[intLoop].offsetLeft = obj.links[intLoop].x
		obj.links[intLoop].offsetTop = obj.links[intLoop].y
	}

	for (var intLoop = 0; intLoop< obj.forms.length; intLoop++) {
		obj.forms[intLoop].offsetParent = par
		var sName = obj.forms[intLoop].name

		obj.forms[intLoop].tagName = "FORM"
		if (""!=sName) {
			window.document.all[sName] = obj.forms[intLoop]
			if (obj.owningElement) _appendAll(obj.owningElement, obj.forms[intLoop], sName)
		}
		for (var intElements = 0; intElements < obj.forms[intLoop].length; intElements++) {
			var i = obj.forms[intLoop][intElements]
			var sName = i.name
			i.offsetParent = par
			i.tagName = _getInputTagName(i.type)
			if (""!=sName) {
				window.document.all[sName] = i
				if (obj.owningElement) _appendAll(obj.owningElement, i, sName)
//					obj.owningElement.all[sName] = window.document.all[sName]
			}
		}
	}
	if (obj.owningElement) {
		var sName = obj.owningElement.id
		window.document.all[sName] = obj.owningElement
		_appendAll(obj.owningElement.offsetParent, obj.owningElement, sName)
	}
}

function _extract(obj, bRefresh) {
	/* This creates the all collection when run in Netscape and
	   promotes the nested name spaces in Netscape to the top-level collection.
	   The length property is not updated for the built-in collections */
	// This function is called recursively for nested layers 

// Add walk up tree to add to collections code... ugh
	obj.document.captureEvents(Event.MOUSEDOWN | Event.MOUSEUP | Event.MOUSEMOVE | Event.KEYDOWN | Event.KEYPRESS | Event.KEYUP)
	obj.document.onmousedown = _NSLayerBubbling;          
	obj.document.onmouseup = _NSLayerBubbling;
	obj.document.onmousemove = _NSLayerBubbling;
	obj.document.onkeydown = _NSLayerBubbling;
	obj.document.onkeypress = _NSLayerBubbling;
	obj.document.onkeyup = _NSLayerBubbling;

	obj.document._type = "document" // internal variable to track state
	// Hookup event handlers to establish event bubbling. 
	if (bRefresh==null) {
		if (""!=obj.id) 
			document.all[obj.id] =  new Object
		var newEl = document.all[obj.id]
		newEl.all = new Object
		obj.document.owningElement= obj.owningElement = newEl

		newEl.id = obj.id
		newEl.style = new Object
		newEl.NSLayer = newEl.style.NSLayer = obj
		newEl.offsetTop = parseInt(obj.top)
		newEl.offsetLeft = parseInt(obj.left) 
		obj._type = "layer" // internal variable
		if (obj.parentLayer.owningElement!=null)
			newEl.offsetParent = obj.parentLayer.owningElement
		else
			newEl.offsetParent = document.body
		newEl.style.pixelTop = parseInt(obj.top)
		newEl.style.pixelLeft = parseInt(obj.left)
		if (null!=obj.clip) {
			newEl.style.pixelWidth = obj.clip.width   // estimation
			newEl.style.pixelHeight = obj.clip.height
		}
		newEl.style.clip = "rect(" + obj.clip.top + " " + obj.clip.width + " " + obj.clip.height + " " + obj.clip.left + ")"
		newEl.offsetWidth = newEl.style.pixelWidth  // estimation
		newEl.offsetHeight = newEl.style.pixelHeight
		if (obj.visibility=="hide")
			newEl.style.visibility = "hidden";
		else if (obj.visibility=="show")
			newEl.style.visibility = "visible";
		else if (obj.visibility=="inherit")
			newEl.style.visibility = "inherit";
		else
			newEl.style.visibility = "";
		newEl.style.zIndex = obj.zIndex
		newEl.style.backgroundColor = obj.bgColor;
		newEl.style.backgroundImage = "url("+obj.background+")";
	
		newEl.innerHTML = ""
	        
		newEl.style.watch("visibility",CheckVisibilityChange)
		newEl.style.watch("pixelTop",CheckTopChange)
		newEl.style.watch("pixelLeft",CheckLeftChange)
		newEl.style.watch("pixelWidth",CheckWidthChange)
		newEl.style.watch("pixelHeight",CheckHeightChange)
		newEl.style.watch("backgroundColor",CheckColorChange)
		newEl.style.watch("zIndex",CheckZIndexChange)
		newEl.style.watch("clip",CheckClipChange)
		newEl.watch("innerHTML",CheckContentChange)
	}
	_extractRoot(obj.document,newEl)	
			
	for (var intLayer = 0; intLayer< obj.document.layers.length; intLayer++) 
		_extract(obj.document.layers[intLayer])  // Nested layers, go get them.
	
}


function _NSLayerBubbling(ev) {
	// Bubble through any positioned elements.
	this.routeEvent(ev);
	// Fire on positioned element
	if (!window.event.cancelBubble)
		if (null!=this.owningElement["on"+ev.type]) this.owningElement["on"+ev.type]()
}

function _NSBubbling(ev) {
	// This simulates very simple event bubbling in Netscape
	// Create the event object on the window.
	window.event = ev;
	// Initialize properties on the event object
	window.event.cancelBubble = false;
	window.event.button = ev.which 
	window.event.keyCode = ev.which
	window.event.type = ev.type
	if ((ev.type=="focus") || (ev.type=="blur")) return true
	// Get the "synthesized" element if it fired the event.
	var el = null;
	if ("document"==ev.target._type) 
		el = ev.target.owningElement.id
	else
		el = ev.target.id
	if ((el!=null) && (el!="")) {
		el = document.all[el]
		window.event.srcElement = el
	} else {
		if (ev.target!=null) {
			window.event.srcElement=ev.target
		}
		else
			ev.target=null
	}
	window.event.returnValue = true
	window.event.clientX = ev.pageX - window.pageXOffset
	window.event.clientY = ev.pageY - window.pageYOffset
	window.event.offsetX = ev.layerX
	window.event.offsetY = ev.layerY
	window.event.screenX = ev.screenX
	window.event.screenY = ev.screenY
	window.event.altKey = ev.modifiers & Event.ALT_MASK
	window.event.ctrlKey = ev.modifiers & Event.CONTROL_MASK
	window.event.shiftKey = ev.modifiers & Event.SHIFT_MASK
	window.event.NSEvent = ev;
	if ((ev.target._type=="layer") && ((ev.type=="mouseover") || (ev.type=="mouseout")))  {
		// Special handling to bubble over and out events on layers
		var elLoop = ev.target.document.owningElement
		while (elLoop!=null) {
			if (!window.event.cancelBubble)
				if (elLoop["on"+ev.type]!=null) elLoop["on"+ev.type]()
					elLoop = elLoop.offsetParent;
		}
	}
	// Send this event onward...
	// Make sure to wire event return values 
	var bCancel = window.routeEvent(ev);
	if (bCancel!=null) 
		window.event.returnValue = bCancel
	// Bubble but do not fire document events twice
	if ((ev.target!=window.document) && (!window.event.cancelBubble))
		if (null!=document["on"+ev.type]) bCancel = document["on"+ev.type]()
		if (bCancel!=null) 
			window.event.returnValue = bCancel
		return (window.event.returnValue)
}

function _setupBubbling() {
	// Setup event bubbling from the source ot the document.
	window.captureEvents(Event.CLICK | Event.MOUSEMOVE | Event.CLICK | Event.DBLCLICK | Event.MOUSEDOWN | Event.MOUSEUP | Event.MOUSEOUT | Event.MOUSEOVER | Event.KEYDOWN | Event.KEYUP | Event.KEYPRESS | Event.FOCUS | Event.BLUR)
	window.onclick = _NSBubbling;
	window.ondblclick = _NSBubbling;
	window.onmousemove = _NSBubbling;
	window.onmouseover = _NSBubbling;
	window.onmouseout = _NSBubbling;
	window.onmousedown = _NSBubbling; 
	window.onmouseup = _NSBubbling;
	window.onkeydown = _NSBubbling;
	window.onkeypress = _NSBubbling;
	window.onkeyup = _NSBubbling;
	window.onfocus = _NSBubbling;
	window.onblur = _NSBubbling;
}

/* The setup() function - This must be called in the onload event of the document */
function setup() {  
	if (4>vers) return;  // Can't help old browsers
	if ("Netscape"==sys) {
		document.all = null;
		document.all = new Array;
		document.body = new Object;
		document.body.clientWidth = window.innerWidth-20; document.body.clientHeight = window.innerHeight-20
		document.body.scrollTop = window.pageXOffset; document.body.scrollLeft = window.pageYOffset
		document.body.watch("scrollTop",CheckScrollTop)
		document.body.watch("scrollLeft",CheckScrollLeft)
		document.body.offsetParent = null
		document.body.offsetLeft = document.body.offsetTop = 0
		document.body.all = new Object
		document.parentWindow = window
		_extractRoot(document,document.body)

		for (var intLayer = 0; intLayer< document.layers.length; intLayer++) {
			_extract(document.layers[intLayer])  // Nested layers, go get them.
		}
		
		_setupBubbling();
		testScroll()
		setInterval("testScroll()",50)
		document.readyState = "complete"
	}               
}
window.onload = setup; // Initialize when loaded
if ("Netscape"==sys)
	document.readyState = "loading"
    
// DHTMLLib2.js Copyright 1997, 1998 by InsideDHTML.com, LLC.
// http://www.insideDHTML.com
// -->