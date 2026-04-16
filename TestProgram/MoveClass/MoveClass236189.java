class A{
void m(){
  switch (kind) {
            case IntroduceKind.CREATE_CONSTANT:
                return "IntroduceConstant"; //NOI18N
            case IntroduceKind.CREATE_VARIABLE:
                return "IntroduceVariable"; //NOI18N
            default:
                throw new IllegalStateException();
        }
    }
}