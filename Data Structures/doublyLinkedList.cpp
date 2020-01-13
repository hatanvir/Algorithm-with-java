#include<bits/stdc++.h>
using namespace std;
struct node{
    struct node *next;
    struct node *prev;
    int data;
};
struct node *head = NULL;
struct node *tail = NULL;

void insertLast(int data){
    struct node *newNode = (node*)malloc(sizeof(node));
    newNode->data = data;
    if(head == NULL){
        head = newNode;
        tail = newNode;
        return;
    }else{
        tail->next = newNode;
        newNode->prev = tail;
        tail = newNode;
    }
}
void insertFirst(int data){
    struct node *newNode = (node*)malloc(sizeof(node));
    newNode->data = data;
    if(head == NULL){
        head = newNode;
        tail = newNode;
        return;
    }else{
        newNode->next = head;
        head->prev = newNode;
        head = newNode;
    }
}
void displayForwored(){
    struct node *myNode = head;
    while(1){
        if(head == NULL || tail == NULL) break;
        cout<<myNode->data<<" ";
        if(myNode == tail) break;
        myNode = myNode->next;
    }
}
void displayBackword(){
    struct node *myNode = tail;
    while(1){
        if(head == NULL || tail == NULL) break;
        cout<<myNode->data<<" ";
        if(myNode == head) break;
        myNode = myNode->prev;
    }
}
int main(){
int n;
  while(1){
    cin>>n;
    insertFirst(n);
    displayForwored();
    cout<<endl;
    displayBackword();
  }
}
