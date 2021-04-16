import { Component, OnInit } from "@angular/core";
import { TranslateService } from "@ngx-translate/core";
import { AuthService } from "src/app/services/auth.service";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
})
export class LoginComponent implements OnInit {

  constructor(private translate: TranslateService, private auth: AuthService) {
    this.translate.setDefaultLang('en');
    this.translate.use('en');
  }

  doGoogleSignIn() {
    this.auth.googleSignin();
  }

  ngOnInit(): void {}
}
