import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HulkStoreServiceService {

  basePath = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }

  getItems() {
    return this.httpClient.get(`${this.basePath}/items`);
  }
  
}
