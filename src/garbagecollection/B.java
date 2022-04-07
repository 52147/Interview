package garbagecollection;
/**
 * 
 * = using public void finalise() =
 * 
 * - Finalize is a call-back method (a method called by the JVM, and not by the user),
 *   that is last method executed on an object.
 * - A subclass may override the finalize method to dispose of system resources or to perform other cleanup.    
 *   
 *   
 * - How to prevent garbage collection using finalize?
 *   - The finalize method of class can be overridden to preserve the reference of the object that is about to be deleted.
 *   
 *   
 *   - finalize is the last method that is executed on an object.
 *   - In the below program, the function 'f()' creates a local object of class B.
 *   - When the call of the function terminate, the scope of the variable 'x' terminates as well, and hence, is marked for collection by the garbage collector.
 *   - However, before the garbage collector could delete the object, finalize runs.
 *   
 *   - Inside the body of the method 'finalize', one can see that the static member of class B 'y', is assigned the reference id of the current object.
 *   - As a result, the reference id of the object to be deleted is preserved, and hence, the object is not deleted.
 *   
 *   - However, it is really important to know that making an object undeletable is risky, and increases the chances of memory leaks.
 *   - Therefore, it is not advisable to do so.
 *   
 *   
 *
 */
// Java code to demonstrate how to prevent garbage collection of a object using finalize method
class B {
    static B y;
    static void f(){
        B x = new B();
    }
    
    protected void finalize() throws Throwable{
        y = this; // Putting the reference id of the current object into the static variable y
  
        System.out.println("Object reference saved. The object won't be collected by the garbage collector");
    }
    
    public static void main(String a[]){
        f(); // function called
        
    }
}