#include <stdlib.h>//���������ͷ�ļ���

void CreatLinkList(LinkList *L,int n){
    LinkList p;//����һ��ָ�룻
    int i;//������
    srand(time(0));//��ʼ��������ӣ�
    *L = (LinkList)malloc(sizeof(Node));
    (*L)->next = NULL;
    for(i = 0;i < n;i ++){
        p = (LinkList)malloc(sizeof(Node));
        p->next = (*L)->next;
        p->data = rand()%100 + 1;
        (*L)->next = p;
    }


}
