
p = rearA->next;//����A��ͷ��㣻
rearA->next = rearB->next->next;//B�ĵ�һ������B��ͷ��㣻
q=rearB->next;
rearB->next = p;
free(q);


