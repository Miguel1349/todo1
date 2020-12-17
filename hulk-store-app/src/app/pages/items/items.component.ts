import { Component, OnInit } from '@angular/core';
import { HulkStoreServiceService } from '../../services/hulk-store-service.service';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html'
})
export class ItemsComponent implements OnInit {

  items: any[] = [];

  constructor(private hulkStoreService: HulkStoreServiceService) { }

  ngOnInit(): void {
    this.hulkStoreService.getItems().subscribe((items: any[]) => {
      this.items = items;
      console.log(this.items);
    });
  }

}
