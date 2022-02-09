import { TestBed } from '@angular/core/testing';

import { ShowsfacultyService } from './showsfaculty.service';

describe('ShowsfacultyService', () => {
  let service: ShowsfacultyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShowsfacultyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
