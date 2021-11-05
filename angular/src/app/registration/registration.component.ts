import { Component, OnInit } from "@angular/core";
import { Registration } from '../models/registration';

@Component({
  selector: "app-registration",
  templateUrl: "./registration.component.html",
})
export class RegistrationComponent implements OnInit {
    registrations: Registration[] = [];
    regModel: Registration;
    showNew: Boolean = false;
    submitType: string = "Save";
    selectedRow: number;
 
  
onNew() {
  this.regModel = new Registration();
  this.submitType = 'Save';
  this.showNew = true;
  }

onSave() {
  if (this.submitType === 'Save') {
    this.registrations.push(this.regModel);
  } else {
  
  // Update existing 
  
  this.registrations[this.selectedRow].firstName = this.regModel.firstName;  
  this.registrations[this.selectedRow].lastName = this.regModel.lastName;  
  this.registrations[this.selectedRow].email = this.regModel.email;  
}
  
  this.showNew = false;
  
}

onEdit(index: number) {
  this.selectedRow = index;
  this.regModel = new Registration();
  // Retrieve selected 
  this.regModel = Object.assign({}, this.registrations[this.selectedRow]);
  this.submitType = 'Update';
  this.showNew = true;
  
}

onDelete(index: number) {
  this.registrations.splice(index, 1);
}

onCancel() {
  this.showNew = false;
}

  ngOnInit() {}
}


