#Scheduler
Task for Ocado:

<p class="has-line-data" data-line-start="0" data-line-end="4">#!- IMPORTANT -!<br>
Checking the data that is in the store and orders files, I am not sure that for all tests the output data given in the file agreed 100%,<br>
so my output data may differ from the data in the output file<br>
!-------------!</p>
<p class="has-line-data" data-line-start="5" data-line-end="15">!-INFORMATIONS ABOUT PROJECT-!<br>
Project contains classes:<br>
Store (Store object class)<br>
ParseStore (Parsing store.json)<br>
Order (Order object)<br>
ParseOrder (Parsing orders.json)<br>
SortOrders (small class sorting orders by complete-by)<br>
Main (Run classs)<br>
AssignOrders (algorithm)<br>
!-END-!</p>
<p class="has-line-data" data-line-start="16" data-line-end="18">How to open:<br>
1.Clone repository</p>
<ol start="2">
<li class="has-line-data" data-line-start="18" data-line-end="19">If needed choose SDK 17 (In intellij IDEA: Right click on project -&gt; Open Module Settings -&gt; Modules -&gt;  Dependencies -&gt; Module SDK -&gt; Choose 17) Also language level should be in version 17</li>
<li class="has-line-data" data-line-start="19" data-line-end="21">Build a project</li>
</ol>
<p class="has-line-data" data-line-start="21" data-line-end="22">How to run:</p>
<ol>
<li class="has-line-data" data-line-start="22" data-line-end="23">Open Terminal</li>
<li class="has-line-data" data-line-start="23" data-line-end="27">Insert command:<br>
Should be something like this:<br>
java -jar <em>your_local_path</em>\ISFScheduler\out\artifacts\ISFScheduler_jar\ISFScheduler.jar parameter1 parameter2</li>
</ol>
<p class="has-line-data" data-line-start="27" data-line-end="31">where:<br>
ISFScheduler.jar is a .jar file in project<br>
parameter1 is .JSON file path for store<br>
parameter2 is .JSON file path for orders</p>
<p class="has-line-data" data-line-start="32" data-line-end="33">For example in my case full command is:</p>
<p class="has-line-data" data-line-start="34" data-line-end="35">java -jar C:\Users\stefa\OneDrive\Pulpit\ISFScheduler\out\artifacts\ISFScheduler_jar\ISFScheduler.jar C:\Users\stefa\OneDrive\Pulpit\zadanie-java\self-test-data\complete-by\store.json C:\Users\stefa\OneDrive\Pulpit\zadanie-java\self-test-data\complete-by\orders.json</p>
<p class="has-line-data" data-line-start="36" data-line-end="38">Output is in form of:<br>
picker-id order-id picking-start-time</p>
