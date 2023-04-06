import { HttpHeaders } from '@angular/common/http';

export class HeaderUtils {
  public static getHeaders(): HttpHeaders {
    return new HttpHeaders({
      'Content-Type': 'application/json',
    });
  }
}
