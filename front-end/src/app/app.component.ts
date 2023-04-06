import { Component } from '@angular/core';
import { UserService } from './services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  listUser: any = [];
  fullName: any;

  constructor(private userService: UserService) {}

  search() {
    this.userService.search(this.fullName).subscribe({
      next: (res) => {
        this.listUser = res;
      },
    });
  }

  delete(user: any) {
    this.userService.delete(user[0]).subscribe({
      next: (res) => {
        this.search();
      },
    });
  }
}
