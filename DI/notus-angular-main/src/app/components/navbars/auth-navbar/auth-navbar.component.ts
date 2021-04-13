import { Component, OnInit } from "@angular/core";
import { TranslateService } from "@ngx-translate/core";

@Component({
  selector: "app-auth-navbar",
  templateUrl: "./auth-navbar.component.html",
})
export class AuthNavbarComponent implements OnInit {
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
