import { HeaderUtils } from './../utils/header.utils';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}

  search(request: any): Observable<any> {
    const header = HeaderUtils.getHeaders();
    const url =
      'http://localhost:8080/api' + '/user/get-user?username=' + request;
    return this.http.get(url, { headers: header });
  }

  delete(request: any): Observable<any> {
    const header = HeaderUtils.getHeaders();
    const url =
      'http://localhost:8080/api' + '/user/delete?id=' + request;
    return this.http.delete(url, { headers: header });
  }
}
