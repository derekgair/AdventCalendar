# Day 1.
input=$1
echo "Part 1"
cat $input | ( let sum=0; while read line; do if [ -z "$line" ]; then echo "$sum"; sum=0; else let "sum=sum+line";  fi ;done; echo $sum )  | sort -n

#Day 1.5
echo "Part 2"
cat $input | ( let sum=0; while read line; do if [ -z "$line" ]; then echo "$sum"; sum=0; else let "sum=sum+line";  fi ;done; echo $sum )  | sort -n | tail -3 | ( sum = 0; while read line; do let sum=sum+$line; done; echo
$sum
