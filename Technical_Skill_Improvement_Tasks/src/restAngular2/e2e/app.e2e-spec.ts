import { CallRestAngular2Page } from './app.po';

describe('call-rest-angular2 App', function() {
  let page: CallRestAngular2Page;

  beforeEach(() => {
    page = new CallRestAngular2Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
