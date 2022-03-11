
function addQuestion() {
          document.getElementById("addQuestion").insertAdjacentHTML("afterend",
                "<form class='selectQuestion'> <h4>Select type of Question</h4><br><select name='questionTypes' id=questionTypes'><option value='multipleChoice'>Multiple Choice Question</option><option value='dropDown'>Drop Down Question</option>
                  </select>");