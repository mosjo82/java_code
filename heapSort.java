//date: 7/1/2023
//status: unsolved
//issue: Can't sort first few elements.


class heapSort{
    public static void main(String args[]){
        int[] arr = {3,73,4,23,15,12,10,45,37,96,54,21,88,34,102};
        int arr_size = arr.length;
        //System.out.println(arr_size);
        heap(arr,arr_size);
        printArr(arr,arr_size);
    }
    static void heap(int[] arr, int arr_size){
        int lastIndex = arr_size - 1;
        for(int parent = lastIndex/2;parent>=0;parent-=1){
            maxHeapify(arr,parent,lastIndex);
        }
        swapArr(arr,0,lastIndex);
        for(lastIndex-=1;lastIndex>=0;lastIndex-=1){
            maxHeapify(arr, 0, lastIndex);
            swapArr(arr, 0, lastIndex);
        }
    }

    static void maxHeapify(int[] arr, int par, int li){
        int left = par*2+1;
        int right = par*2+2;
        if(left>li) return;
        if(left==li){
            if(arr[left]>=arr[par]){
                swapArr(arr,left,par);
                //maxHeapify(arr, left, li);
                return;
            }
        }
        if(arr[left]>=arr[par] || arr[right]>=arr[par]){
            if(arr[left]>arr[right]){
                swapArr(arr, left, par);
                maxHeapify(arr, left, li);
            }
            else{
                swapArr(arr, right, par);
                maxHeapify(arr, right, li);
            }
        }
    }
    
    static void swapArr(int[] arr,int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static void printArr(int[] arr, int arr_size){
        for(int i=0;i<arr_size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

