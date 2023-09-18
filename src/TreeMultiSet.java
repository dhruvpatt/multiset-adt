public class TreeMultiSet extends MultiSet{
    private Tree;

    public Tree(){
        this.Tree = new Tree(null);
    }
    public bool Add(Object item){
        this.Tree.Insert(item);
        return true;
    }
    public void Remove(Object item){
        this.Tree.DeleteItem(item);
    }
    public bool Contains(Object item){
        return this.Tree.Contains(Object item);
    }
    public bool IsEmpty(){
        return this.Tree.IsEmpty();
    }
    public int Count(){
        return this.Tree.Count();
    }
    public int Size(){
        return this.Tree.Length();
    }
}