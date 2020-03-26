#include<bits/stdc++.h>
using namespace std;

struct node{
    int data;
    struct node *next = NULL;;
};
struct node *head = NULL;
void push(int data){
    struct node *newNode = (node*) malloc(sizeof(node));
     newNode->data = data;
    if(head == NULL){
     head = newNode;
     head->next = NULL;
     return;
    }
    newNode->next = head;
    head = newNode;
}
void print(){
    struct node *newNode = (node*) malloc(sizeof(node));
    newNode = head;
    while(newNode->next!=NULL){
        cout<<newNode->data<<" ";
        newNode=newNode->next;
    }
    cout<<newNode->data<<" ";
}
int pop(){
   int popValue = head->data;
   head = head->next;
   return popValue;
}
int main()
{
    int n;
    int c;
    while(1){

        //print();

        cout<<"pop to select 1"<<endl;
        cout<<"push to select 2"<<endl;
        cout<<"print to select 3"<<endl;
        cin>>c;
        if(c == 1){
            pop();
        }else if(c == 2){
            cin>>n;
            push(n);
            //print();
            //cou<<endl;
        }else if(c==3){
            print();
        }
    }
    return 0;
}
