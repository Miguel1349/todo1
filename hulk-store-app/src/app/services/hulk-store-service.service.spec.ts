import { TestBed } from '@angular/core/testing';

import { HulkStoreServiceService } from './hulk-store-service.service';

describe('HulkStoreServiceService', () => {
  let service: HulkStoreServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HulkStoreServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
