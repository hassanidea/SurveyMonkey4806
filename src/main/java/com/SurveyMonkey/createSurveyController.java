import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class createSurveyController {

    @Autowired
    private AddressBookRepository addressBookRepo;
    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    @GetMapping("/buddyInfo")
    public String greetingForm(Model model) {
        model.addAttribute("buddyInfo", new BuddyInfo());
        return "buddyInfo";
    }

    @PostMapping("/buddyInfo")
    public String greetingSubmit(@ModelAttribute @RequestBody BuddyInfo buddyInfo, Model model) {
        if (addressBookRepo.count()==0) {
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddyInfo);
            buddyInfoRepository.save(buddyInfo);
            addressBookRepo.save(addressBook);
        }
        else{
            AddressBook addressBook = addressBookRepo.findAll().iterator().next();
            addressBook.addBuddy(buddyInfo);
            buddyInfoRepository.save(buddyInfo);
            addressBookRepo.save(addressBook);
        }
        model.addAttribute("buddyInfo", buddyInfo);
        return "result";
    }

}