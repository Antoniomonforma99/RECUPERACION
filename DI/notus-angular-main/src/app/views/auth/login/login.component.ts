import { Component, OnInit } from "@angular/core";
import { TranslateService } from "@ngx-translate/core";
import { AuthService } from "src/app/services/auth.service";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
})
export class LoginComponent implements OnInit {

  constructor(translate: TranslateService, public auth: AuthService) {
    translate.setDefaultLang('en');
    translate.use('en');
  }

  ngOnInit(): void {}
}
