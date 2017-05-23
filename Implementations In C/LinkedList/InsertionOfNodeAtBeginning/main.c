#include <stdio.h>
#include <stdlib.h>
struct Node{
int data;
struct Node* next;
};
void insert(int x);
void print();
void reversePrint();
struct Node* head; //head is a pointer variable which contains address of first node
int main()
{
   head=NULL;
   printf("How many nodes ? ");
   int n;
   scanf("%d",&n);
   while(n-->0){
   printf("\nenter the element you wish to insert ");
   int elt;
   scanf("%d",&elt);
   insert(elt);
   print();
   }
   reversePrint();
       return 0;
}
void insert(int x){
struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
temp->data=x;
temp->next=head;
head=temp;
}
void print(){
struct Node* temp1;
temp1=head;
while(temp1!=NULL){
    printf("%d ",temp1->data);
    temp1=temp1->next;
}
}
void reversePrint(){
    printf("Reversed List is:->");
    struct Node* previous;
    struct Node* NextNode;
    previous=NULL;
    struct Node* var=head;
    while(var!=NULL){
        NextNode=var->next;
        var->next=previous;
        previous=var;
        var=NextNode;
    }
    head=previous;
    struct Node* temp2=head;
    while(temp2!=NULL){
        printf("%d ",temp2->data);
        temp2=temp2->next;
    }
}

