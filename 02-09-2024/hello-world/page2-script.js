var myImg = document.getElementById('carousel-img');
var myContainer = document.querySelector('#my-container');
var counterDisplay = document.querySelector('#counter-display');


let counter = 0;

console.log(myImg, myContainer);

counterDisplay.innerHTML = counter;


function incrementCounter(){
    counter++;
    counterDisplay.innerHTML = counter;
    const myInterval = setInterval(()=>{console.log("click")}, 1000);

    setTimeout(()=> clearInterval(myInterval), 5000)
}

document.querySelector('#counter-button').addEventListener('click', incrementCounter);

async function myF(...args){
    let sum = 0;
    await myASyncFunction();
    args.forEach(nr => {sum+= nr});
    console.log(sum);
}

async function getData() {
    const url = "https://example.org/products.json";
    try {
      const response = await fetch(url, {
        method: 'post'
      });
      if (!response.ok) {
        throw new Error(`Response status: ${response.status}`);
      }
  
      const json = await response.json();
      console.log(json);
    } catch (error) {
      console.error(error.message);
    }
  }

  fetch("http://.....", {

  })