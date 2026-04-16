interface Animal {}

interface Mammal extends Animal {
    default String identifyMyself() {
        return "Mammal";
    }
}