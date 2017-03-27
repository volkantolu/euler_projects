import { Component, OnInit} from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

@Component({
    selector: 'app-root',
    template : '<ul> <li>{{varList.one}}</li> <li>{{varList.key}}</li></ul>'
//    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
    
    
export class AppComponent implements OnInit {

    title = 'Welcome';

    varList = [{ "one": "offline-one", "key": "offline-key" }];

    constructor(private http : Http){
        
    }
    
    ngOnInit() {

    this.http.get("http://echo.jsontest.com/key/value/one/two").toPromise().then(r => r.json()).then(r => this.varList = r);

    }

}
