/**
 * 
 */
console.log(`Welcome`)
// Properties defined by getters and setters are known as accessor
// properties to distinguish them from data properties
// that have a simple value.
var myobject = {
  // An ordinary data property
  x: 0,
  // An accessor property defined as a pair of functions
  get data () { return this.x; },
  set data (value) { this.x = value; }
};
myobject.x = 200;
console.log('Data: ' + myobject.data);//
console.log('x: ' + myobject.x);
myobject.data = 100;
console.log('Data:' + myobject.data);
//a comma is required after the function body (get) to separate the
// method from the next method or data property

// Note the use of the keyword this in the getters and setter above.
// JavaScript invokes these functions as methods of the object on which they are defined,
// which means that within the body of the function "this" refers to the current object.
// So the getter method for the data property can refer to the x property as this.x.