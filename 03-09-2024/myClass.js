class myClass {

    #myPrivateField;

    constructor(parameters) {
        this.field1 = "test";
    }

    myMethod(){
        this.field1 = ",...";
    }

    static myStaticMethod(){
        console.log('hello static')
    }

    #myPrivateMethod(){

    }
}


class secondClass extends myClass{

}


class Chronometer{
    #timer;
    #intervalId;

    constructor(){
        this.#timer = 0;
    }

    start(){
        this.#intervalId = setInterval(()=>{
            this.#timer++;
            console.log(this.#timer);
        }, 1000)
    }

    stop(){
        clearInterval(this.#intervalId);
        this.#timer = 0;
    }
}



const myObjectLiteral = {
    id: '1234',
    name: 'test',
    myFunction: () => { console.log('Hello')}
}




const c1 = new myClass();
c1.myMethod();
myClass.myStaticMethod();

const c2 = new secondClass();