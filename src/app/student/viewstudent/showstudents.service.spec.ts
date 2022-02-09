import { TestBed } from '@angular/core/testing';

import { ShowstudentsService } from './showstudents.service';

describe('ShowstudentsService', () => {
  let service: ShowstudentsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShowstudentsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
