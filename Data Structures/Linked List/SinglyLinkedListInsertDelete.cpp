#include<bits/stdc++.h>
using namespace std;

struct node{
    int data;
    struct node *next;
};
struct node *head = NULL;
struct node *tail = NULL;

int insertFirst(int n){

    int arr[10];

    struct node *newNode = (node*)malloc(sizeof(node));
    newNode->data = n;
    newNode->next = head;
    head = newNode;
}
int insertLast(int n){
    struct node *newNode = (node*)malloc(sizeof(node));
    newNode->data = n;
    newNode->next = NULL;

    if(head == NULL){
        head = newNode;
        tail = newNode;
    }else{
        tail->next = newNode;
        tail = newNode;
    }
}
int display1(){
    struct node *values = head;
    while(values!=NULL){
        cout<<values->data<<" ";
        values = values->next;
    }
    cout<<endl;
}
int display2(){
    struct node *values = head;
    while(values!=NULL){
        cout<<values->data<<" ";
        values = values->next;
    }
    cout<<endl;
}
int main()
{
    int n;
    while(1){
        cin>>n;
        insertFirst(n);
        display1();
        display2();
    }
}
