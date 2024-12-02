class Calculator {
  constructor() {
    this.result = 0;
  }
  add(a, b) {
    this.result = a + b; 
    return this.result;
  }
  subtract(a, b) {
    this.result = a - b;
    return this.result;
  }
  multiply(a, b) {
    this.result = a * b;
    return this.result;
  }
  divide(a, b) {
    if(b === 0) {
      throw new Error("Division by zero");
    }
    this.result = a / b;
    return this.result;
  }
  clear() {
    this.result = 0;
  }
}
// example usage
const calculator = new Calculator();

let result = calculator.add(5,3);
console.log(result);   //output 8

result = calculator.subtract(10, 4);
console.log(result);   // output 6

result = calculator.multiply(2, 6);
console.log(result);     //output 12

result = calculator.divide(10, 2);
console.log(result);     // output 5

calculator.clear();
console.log(calculator.result);     //output 0 
