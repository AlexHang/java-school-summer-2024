import { Component, Input } from '@angular/core';
import { HousingLocation } from '../../model/housinglocation';
import { CommonModule, NgFor } from '@angular/common';

@Component({
  selector: 'app-housing-location',
  standalone: true,
  imports: [NgFor],
  template: `<section class="listing">
    <img class="listing-photo" [src]="housingLocation.photo" alt="Exterior photo of {{housingLocation.name}}">
    <h2 class="listing-heading">{{ housingLocation.name }}</h2>
    <p class="listing-location">{{ housingLocation.city}}, {{housingLocation.state }}</p>
  </section>`,
  styleUrls: ['./housing-location.component.css'],
})
export class HousingLocationComponent {
  @Input() housingLocation!: HousingLocation;
}
