//berapa minimal step yang diperlukan
static int howManyStep(int n, char src, char aux, char dest){
    int step=0;
    if(n == 1){
        System.out.println("dari " + src + " ke " + dest);
    } else {
        howManyStep(n-1, src, dest, aux);
        System.out.println("dari " + src + " ke " + dest);
        step++;
        howManyStep(n-1, aux, src, dest);
    }
    return step;
    }

static void howManyStep(int 3){
    howManyStep(3, 'A', 'B', 'C');
}