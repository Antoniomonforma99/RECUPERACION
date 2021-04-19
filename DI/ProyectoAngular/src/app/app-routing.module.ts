import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

// layouts
import { AdminComponent } from "./layouts/admin/admin.component";
import { AuthComponent } from "./layouts/auth/auth.component";

// admin views
import { DashboardComponent } from "./views/admin/dashboard/dashboard.component";
import { MapsComponent } from "./views/admin/maps/maps.component";
import { SeriesListComponent } from "./views/admin/series-list/series-list.component";
import { MoviesListComponent } from "./views/admin/movies-list/movies-list.component"
import { SettingsComponent } from "./views/admin/settings/settings.component";

// auth views
import { LoginComponent } from "./views/auth/login/login.component";
import { RegisterComponent } from "./views/auth/register/register.component";

// no layouts views
import { LandingComponent } from "./views/landing/landing.component";
import { ProfileComponent } from "./views/profile/profile.component";
import { MoviesNewComponent } from "./views/admin/movies-new/movies-new.component";
import { SeriesNewComponent } from "./views/admin/series-new/series-new.component";

const routes: Routes = [
  // admin views
  {
    path: "admin",
    component: AdminComponent,
    children: [
      { path: "dashboard", component: DashboardComponent },
      { path: "settings", component: SettingsComponent },
      { path: "maps", component: MapsComponent },
      { path: "movies", component: MoviesListComponent },
      { path: "series", component: SeriesListComponent },
      { path: "movies/new", component: MoviesNewComponent},
      { path: "series/new", component: SeriesNewComponent},
      { path: "", redirectTo: "dashboard", pathMatch: "full" },
    
    ],
  },
  // auth views
  {
    path: "auth",
    component: AuthComponent,
    children: [
      { path: "login", component: LoginComponent },
      { path: "register", component: RegisterComponent },
      { path: "", component: LoginComponent, pathMatch: "full" },
    ],
  },
  // no layout views
  { path: "profile", component: ProfileComponent },
  { path: "landing", component: LandingComponent },

  { path: "", component: LandingComponent },
  { path: "**", redirectTo: "", pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
