package day0612;

//打家劫舍进阶版（二叉树结构）
public class TreeNode {
    public int val;
    public TreeNode left;//左子树
    public TreeNode right;//右子树

    //添加有参构造方法
    public TreeNode(int val,TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNode node5=new TreeNode(1,null,null);
        TreeNode node4=new TreeNode(3,null,null);
        TreeNode node3=new TreeNode(3,null,node5);
        TreeNode node2=new TreeNode(2,null,node4);
        TreeNode node1=new TreeNode(3,node2,node3);

        System.out.println(maxMoneyTree(node1));
    }

    //深度优先搜索dfs
    //需要返回两个值
    //1.当前节点选择后 最优解
    //2.当前节点不选择 最优解
    public static int[] dfs(TreeNode node){
        //出口
        if(node==null) {
            return new int[]{0,0};
        }
        //递归实现
        int[] left=dfs(node.left);
        int[] right=dfs(node.right);
        //假设当前节点选择了 左右子树一定不选择
        int select=node.val+left[1]+right[1];
        //假设当前节点不选择  左右子树可以选，可以不选
        int noSelect=Math.max(left[0],left[1])+Math.max(right[0],right[1]);

        return new int[]{select,noSelect};
    }
    public static int maxMoneyTree(TreeNode node){
        int[] result=dfs(node);
        return Math.max(result[0],result[1]);
    }
}
