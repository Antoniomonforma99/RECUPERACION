import { Component, OnInit } from "@angular/core";
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: "app-index-navbar",
  templateUrl: "./index-navbar.component.html",
})
export class IndexNavbarComponent implements OnInit {
  navbarOpen = false;

  constructor(translate: TranslateService) {
    translate.setDefaultLang('en'); 
    translate.use('en');
  }

  ngOnInit(): void {}

  setNavbarOpen() {
    this.navbarOpen = !this.navbarOpen;
  }
}
