//Perform fuzzy set operations and plot the graph as required.


  A = 1:10;
  B = randi([1,10],1,10);
   ub=15;
   lb=0;
   union=max(A,B);
   inter=min(A,B);
   comp=1-A;
   prod=A*B;
   prod=A.*B;
   sum=A+B;
   diff=A-B;
b_sum = min(A+B,ub);
b_prod=max(A.*B,ub);
b_diff=max(A-B,lb);
figure;
subplot(3,2,1);
plot(union,'Display',max(A,B));
title('Union');
subplot(3,2,2);
plot(inter,'Display','min(A,B)');
title('intersection');
subplot(3,2,3);
plot(comp,'Display','1-A');
title('Complement');
subplot(3,2,4);
plot(prod,'Display','A.*B');

title('Algebraic product');
subplot(3,2,5);
 plot(Sum,'Display','A+B');
 plot(sum,'Display','A+B');
 title('Algebraic sum');
 subplot(diff,'Display','A-B');
subplot(3,2,6);
 plot(diff,'Display','A-B');
 title('Algebraic Difference');
 subplot(3,2,7);
plot(b_sum,'Display','min(A+B,ub)');
 title('Bounded sum');
 subplot(3,2,8);
plot(b_prod,'Display',min(A.*B,ub)');

 title('Bounded Product');
 subplot(3,2,9);
 plot(b_diff,'Display','max(A-B,lb)');
 title('Bounded Difference');
 b_sum = min(A+B,ub);
b_prod=max(A.*B,ub);
b_diff=max(A-B,lb);
figure;
subplot(3,2,1);
plot(union,'Display',max(A,B));

