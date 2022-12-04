class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
var sum: Int = 0

fun bstToGst(root: TreeNode?): TreeNode? {
    return if (root === null) {
        return null
    } else {
        bstToGst(root.right)
        sum += root.`val`
        root.`val` = sum
        bstToGst(root.left)
        return root
    }
}

fun main(args: Array<String>) {
    var root = TreeNode(4)
    root.right = TreeNode(6)
    root.right!!.right = TreeNode(7)
    root.right!!.right!!.right = TreeNode(8)
    root.right!!.right!!.left = null
    root.right!!.left = TreeNode(5)
    root.right!!.left!!.right = null
    root.right!!.left!!.left = null

    root.left = TreeNode(1)
    root.left!!.right = TreeNode(2)
    root.left!!.right!!.right = TreeNode(3)
    root.left!!.right!!.left = null

    root.left!!.left = TreeNode(0)
    root.left!!.left!!.right = null
    root.left!!.left!!.left = null

    bstToGst(root)
}
