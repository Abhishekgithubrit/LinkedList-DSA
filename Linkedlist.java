public class Linkedlist {
    Node head;
    class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
void addFirst(int data){
   Node temp = new Node(data);
   if(head == null){
    head = temp;
    return;
   }
    temp.next = head;
    head = temp;
}
void addLast(int data){
Node temp = new Node(data);
if(head == null){
    head = temp;
    return;
}
Node curr = head;
while(curr.next != null){
    curr = curr.next;
}
curr.next = temp;
}
void getFirst(){
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
    System.out.println("The First Node is -> " + head.data);
}
void getLast(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node curr = head;
    while(curr.next != null){
        curr = curr.next;
    }
    System.out.println("The last node is ->" + curr.data);
}
void getAtIndex(int idx){
    if(head == null){
        System.out.println("list is Empty");
        return;
    }
    Node curr = head;
    for(int i =0; i<idx; i++){
        curr = curr.next;
    }
    System.out.println("The node at index is ->" + curr.data);

}
void addAtIndex(int idx, int data){
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    if(idx < 0){
        System.out.println("Invalid argument");
        return;
    }
    if(idx == 0){
        addFirst(data);
        return;

    }
    Node t = new Node(data);
    Node curr = head;
    for(int i =0; i<idx-1; i++){
        curr=curr.next;
    }
    t.next = curr.next;
    curr.next = t;
}

void removeFirst(){
    if(head == null){
        System.out.println("List is Empty");
    }
    head = head.next;
}
void reverseP(){
    if(head==null || head.next==null){
        return;
    }
    Node pre = head;
    Node curr = head.next;
    while(curr != null){
     Node next = curr.next;
     curr.next = pre;
     pre = curr;
     curr=next;
    }
    head.next = null;
    head = pre;
   
}
private Node get(int idx){
Node curr = head;
for(int i =0; i<idx; i++){
    curr = curr.next;   
}
return curr;
}
void reverseItretive(int idx){
    int li =0;
    int ri = 0;
    for(int i =0; i<idx; i++){
        ri++;
    }
    while(li<ri){
        Node left = get(li);
        Node right = get(ri);
        int temp = left.data;
        left.data = right.data;
        right.data = temp;
        li++;
        ri--;
    }
}
void removeAtIndex(int idx){
    if(head == null){
        System.out.println("The List is Empty");
        return;
    }
    if(idx == 0){
        removeFirst();
    }
    Node curr = head;
    for(int i =0; i<idx-1; i++){
        curr = curr.next;
    }
    curr.next= curr.next.next;
}
void removeLast(){
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
    if(head.next == null){
        head = null;
        return;
    }
    Node slast = head;
    Node last= head.next;
    while(last.next != null){
       last = last.next;
       slast = slast.next;
    }
 slast.next = null;
}
void kthElementFormLast(int k){
    Node s = head;
    Node f = head;
    for(int i =0; i<k; i++){
        f = f.next;
    }
    while(f != null){
        f = f.next;
        s = s.next;
    }
    System.out.println("The kthElementFromLast is ->" +  s.data);

}
void mid(){
    Node f = head;
    Node s = head;
    while(f.next != null && f.next.next != null){
        s = s.next;
        f = f.next.next;
    }
    System.out.println("The Mid of the linked list is ->" + s.data);
}
void display(){
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
        Node t = head;
        while(t != null){
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.println("null");
    }



public static void main(String[] args){
    Linkedlist list = new Linkedlist();
  list.addFirst(10);
  list.addFirst(20);
  list.addFirst(30);
  list.addFirst(40);
  list.addFirst(50);
  list.addLast(60);
  list.display();

//   list.removeFirst();
//   list.removeLast();
// list.getFirst();
// list.getLast();
// list.getAtIndex(3);
// list.addAtIndex(0, 40);
// list.reverseP();
// list.reverseItretive(2);
// list.removeAtIndex(2);
// list.kthElementFormLast(2);
list.mid();
list.display();
}
}
    


