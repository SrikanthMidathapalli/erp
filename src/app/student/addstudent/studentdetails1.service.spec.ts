import { TestBed } from '@angular/core/testing';

import { Studentdetails1Service } from './studentdetails1.service';

describe('Studentdetails1Service', () => {
  let service: Studentdetails1Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Studentdetails1Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
