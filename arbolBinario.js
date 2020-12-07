insercionEnArbolBinario = function (binaryTree, value, currentTree) {
	let root = binaryTree[currentTree];
	let leftNode = binaryTree[2 * currentTree + 1];
	let rightNode = binaryTree[2 * currentTree + 2];

	if (binaryTree.length == 0) {
		binaryTree.push(valor);
		return;
	}
	if (value < root) {
		if (leftNode == null) {
			binaryTree[2 * currentTree + 1] = value;
		}
		else {
			insercionEnArbolBinario(binaryTree, value, 2*currentTree + 1);
		}
	}
	else {
		if(leftNode==null){
			binaryTree[2 * currentTree + 1] = null;
		}
		if (rightNode == null) {
			binaryTree[2 * currentTree + 2] = value;
		}
		else {
			insercionEnArbolBinario(binaryTree, value, 2*currentTree + 2);
		}
	}
}




// 
let arbolBinario = [6, 2, 8];
insercionEnArbolBinario(arbolBinario,10,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,7,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,1,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,20,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,30,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,14,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,5,0);
console.log(arbolBinario);
insercionEnArbolBinario(arbolBinario,9,0);
console.log(arbolBinario);