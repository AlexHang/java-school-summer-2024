import { Component } from '@angular/core';
import { HomeComponent } from './home-component/home.component';
import { HousingLocationComponent } from './housing-location-component/housing-location.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ HomeComponent, HousingLocationComponent ],
  template: `<main>
    <header class="brand-name">
      <img class="brand-logo" src="/assets/logo.svg" alt="logo" aria-hidden="true">
    </header>
    <section class="content">
      <home-component></home-component>
    </section>
  </main>`,
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'default';
}
