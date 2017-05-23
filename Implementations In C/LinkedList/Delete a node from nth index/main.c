#include <stdio.h>
#include <stdlib.h>
struct Node{
int data;
struct Node* next;
};
void insert(int index,int value);
void print();
void reversePrint();
void delete(int index);
struct Node* head;
int main()
{
    head=NULL;
    printf("Enter the size of list:");
    int n,dindex;
    scanf("%d",&n);
    while(n-->0){
    printf("Enter position ");
    int index,value;
    scanf("%d",&index);
    printf("Enter value ");
    scanf("%d",&value);
    insert(index,value);
    }
    print();
    printf("Wanna delete any Node...?? Enter its index ");
    scanf("%d",&dindex);
    printf("Node with %d index delted",dindex);
    delete(dindex);
    print();
    reversePrint();
    return 0;
}
void insert(int index,int value){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=value;
    if(index==0){
     temp->next=head;
     head=temp;
    }else{
    struct Node* temp1;
    temp1=head;
    int i;
    for(i=0;i<=index-2;i++){
        temp1=temp1->next;
    }
    temp->next=temp1->next; //NUll is passed here to temp->next
    temp1->next=temp;
    }
}
void print(){
struct Node* var=head;
printf("var is:->%d\n",var);
printf("The Linked List is:->\n");
while(var!=NULL){
    printf("%d ",var->data);
    var=var->next;
}
}
void reversePrint(){
    struct Node *current,*previous, *nextNode;
    current=head;
    previous=NULL;
    while(current!=NULL){
    nextNode=current->next;
    current->next=previous;
    previous=current;
    current=nextNode;
    }
    head=previous;
    printf("\nreversed Linked List is:-> ");
    struct Node* var1=head;
    while(var1!=NULL){
        printf("%d ",var1->data);
        var1=var1->next;
    }
}
void delete(int dindex){
struct Node* temp=head;
struct Node* nextNode;
int i;
for(i=0;i<=dindex-2;i++){
    temp=temp->next;
    nextNode=temp->next;
}
temp->next=nextNode->next;
}

