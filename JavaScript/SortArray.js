//Perform sorting of an array in descending order
 
    function bubbleSortDescending(arr)
    {
        const n = arr.length;

        let swapped;

        do{
            swapped = false;

            for(let i = 0; i < n; i++){
                if((arr[i]) < arr[i+1])
                {
                    //swap elements arr[i] and arr[i+1]

                    let temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
    const numbers = [5,2,9,1,7,6];

    bubbleSortDescending(numbers);

    console.log(numbers);
    
 /* 
const numbers = [5,2,9,1,5,6];

numbers.sort(function(a,b)
{
    return b-a;
});

console.log(numbers); */