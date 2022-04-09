package nestedclass;

class OuterParent
{
     class InnerParent { }

     class InnerChild1 extends OuterParent { }
}
class OuterChild extends OuterParent
{
     class InnerChild2 extends OuterParent { }
}