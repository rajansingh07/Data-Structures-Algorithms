**Two Pointer question-identification flowchart** 

```text
                         ┌───────────────────┐
                         │    TWO POINTERS   │
                         └─────────┬─────────┘
                                   │
                                   ▼
                    ┌─────────────────────────┐
                    │ Array / Linked List ?   │
                    └────────────┬────────────┘
                                 │
                  ┌──────────────┴──────────────┐
                  ▼                             ▼
             ┌─────────┐                  ┌──────────────┐
             │  ARRAY  │                  │ LINKED LIST  │
             └────┬────┘                  └──────┬───────┘
                  │                              │
                  ▼                              ▼
        ┌──────────────────┐            ┌─────────────────┐
        │ Sorted / Sort ?  │            │ Detect Cycle ?  │
        └────────┬─────────┘            └────────┬────────┘
                 │                               │
                YES                             YES
                 │                               │
        ┌────────┼─────────┐                     ▼
        ▼        ▼         ▼              ┌──────────────┐
      MERGE   REMOVE   REARRANGE          │ SLOW + FAST  │
     ARRAYS  DUPLICATES  ELEMENTS         │   POINTERS   │
        │        │         │              └──────────────┘
        └────────┴─────────┘
                 │
                 ▼
       ┌──────────────────────┐
       │ Pair / Triplet /     │
       │ Quadruple ?          │
       └──────────┬───────────┘
                  │
                 YES
                  │
                  ▼
       ┌──────────────────────┐
       │     TWO POINTERS     │
       └──────────┬───────────┘
                  │
                  ▼
       ┌──────────────────────┐
       │   LEFT + RIGHT       │
       │     POINTERS         │
       └──────────────────────┘
```

### Quick recognition rule

```text
ARRAY
 │
 ├── Sorted / Can Sort
 │      │
 │      ├── Merge
 │      ├── Remove Duplicates
 │      ├── Rearrange
 │      └── Pair / Triplet / Quadruple
 │
 └── → Think TWO POINTERS


LINKED LIST
 │
 └── Cycle / Loop / Middle
        │
        └── → Think SLOW + FAST POINTERS
```