function heapify(arr, len, i) {
  let root = i;
  const left = 2 * i + 1;
  const right = 2 * i + 2;

  if (left < len && arr[root] < arr[left]) root = left;
  if (right < len && arr[root] < arr[right]) root = right;

  if (i !== root) {
    const temp = arr[i];
    arr[i] = arr[root];
    arr[root] = temp;

    heapify(arr, len, root);
  }
}

function heapSort(arr) {
  len = arr.length;

  for (let i = len; i >= 0; i--) {
    heapify(arr, len, i);
  }

  for (let i = len - 1; i >= 0; i--) {
    const temp = arr[0];
    arr[0] = arr[i];
    arr[i] = temp;

    heapify(arr, i, 0);
  }
}


const arr = [];
for (let i = 0; i < 10000000; i++) {
  arr.push(Math.floor(Math.random() * 10000000));
}

heapSort(arr);
console.log(arr);