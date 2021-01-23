n=gets.to_i;
arr=[]
for i in 0...n
    a=gets.to_i;
    arr.push a;  #arr[i]=a  
end
for p in n.downto(0) do
    print arr[p],"\n"
end