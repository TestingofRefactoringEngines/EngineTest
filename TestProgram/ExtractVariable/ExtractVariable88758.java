class A{
void m(){
for(int i=0;i<list.size() && list.get(i).good();++i){
   list.get(i).doSomething();
   list.get(i).doAnother();
   list.get(i).done();
}
}
}