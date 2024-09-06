import { NgFor, NgIf } from "@angular/common";
import { Component } from "@angular/core";

@Component({
    selector: 'counter-component',
    standalone: true,
    imports: [ NgFor, NgIf ],
    template: `
        <h1>YOU CLICKED {{this.counter}} TIMES</h1>
        <button (click)="incrementCounter()">Click me</button>
        <br/>
        <input (keyup)="handleInputValueChanged($event)" type="number" label="Hello"/>
        <h3 *ngIf="this.counter % 2 === 0">{{myString}}</h3>
        <h1 *ngFor="let nr of myArrayToRender">{{nr}}</h1>
      `,

  })
  export class CounterComponent{
    counter: number;
    myArray: number[]
    myString: String;
    myArrayToRender: number[];
    
    constructor(){
        this.counter = 0;
        this.myArray = [];
        this.myArrayToRender = [];
        this.myString = "Test";
    }

    incrementCounter(){
        this.counter++;
        this.myArray.push(this.counter);
        this.myArrayToRender = this.myArray;
    }

    handleInputValueChanged(ev: any){
        console.log(ev)
        this.myString=ev?.target?.value;
        const inputNumber =  Number(this.myString);
        this.myArrayToRender = this.myArray?.filter(el => el % inputNumber === 0)
    }
  }