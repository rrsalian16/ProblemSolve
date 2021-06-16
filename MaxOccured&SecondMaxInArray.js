
/**
 * Function is to get Max occured and sencond max occured string in arry
 * @param {Array[String]} arr Array of strings.
 * @returns  array of max and sencond max occured Strings in array
 */
function maxAndSecondMaxOccured(arr) {
    if (arr?.length) {
        let temp = {};
        for (let city of cityList) {
            if (temp[city]) {
                temp[city] = temp[city] + 1;
            } else {
                temp[city] = 1;
            }
        }
        console.log(temp);
        let inSortedOrder=Object.keys(temp).sort((i,j)=>temp[j]-temp[i]);
        return [inSortedOrder[0], inSortedOrder[1]]
    }else{
        return [undefined, undefined];
    }
}

let cityList = ["Chennai", "Mangalore", "Bangalore", "Mangalore", "Mumbai", "Bangalore", "Mangalore"];
let result=maxAndSecondMaxOccured(cityList);
console.log(result)