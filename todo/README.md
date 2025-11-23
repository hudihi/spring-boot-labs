# Todo API Endpoint built on spring boot framework



Base URL: `http://localhost:8080/api/v1/todos`

## 1. Create Todo
**POST** `/api/v1/todos`

**Request Body:**
```json
{
  "title": "Complete project",
  "description": "Finish the Spring Boot todo application",
  "is_completed": false
}
```

**cURL Example:**
```bash
curl -X POST http://localhost:8080/api/v1/todos \
  -H "Content-Type: application/json" \
  -d "{\"title\":\"Complete project\",\"description\":\"Finish the Spring Boot todo application\",\"is_completed\":false}"
```

---

## 2. Get Todo by ID
**GET** `/api/v1/todos/{id}`

**cURL Example:**
```bash
curl http://localhost:8080/api/v1/todos/1
```

---

## 3. Get All Todos (Paginated)
**GET** `/api/v1/todos/all?page=0&size=10&sort=id,asc`

**Query Parameters:**
- `page` - Page number (default: 0)
- `size` - Page size (default: 20)
- `sort` - Sort field and direction (e.g., `id,asc` or `title,desc`)

**cURL Example:**
```bash
curl "http://localhost:8080/api/v1/todos/all?page=0&size=10"
```

---

## 4. Update Todo
**PUT** `/api/v1/todos/{id}`

**Request Body:**
```json
{
  "title": "Updated title",
  "description": "Updated description",
  "is_completed": true
}
```

**cURL Example:**
```bash
curl -X PUT http://localhost:8080/api/v1/todos/1 \
  -H "Content-Type: application/json" \
  -d "{\"title\":\"Updated title\",\"description\":\"Updated description\",\"is_completed\":true}"
```

---

## 5. Delete Todo
**DELETE** `/api/v1/todos/{id}`

**cURL Example:**
```bash
curl -X DELETE http://localhost:8080/api/v1/todos/1
```

---

## Using Postman or Similar Tools

1. **Create Todo:**
   - Method: POST
   - URL: `http://localhost:8080/api/v1/todos`
   - Headers: `Content-Type: application/json`
   - Body (raw JSON):
     ```json
     {
       "title": "My Todo",
       "description": "Todo description",
       "is_completed": false
     }
     ```

2. **Get All Todos:**
   - Method: GET
   - URL: `http://localhost:8080/api/v1/todos/all?page=0&size=10`

3. **Get Todo by ID:**
   - Method: GET
   - URL: `http://localhost:8080/api/v1/todos/1`

4. **Update Todo:**
   - Method: PUT
   - URL: `http://localhost:8080/api/v1/todos/1`
   - Headers: `Content-Type: application/json`
   - Body (raw JSON): Same format as Create

5. **Delete Todo:**
   - Method: DELETE
   - URL: `http://localhost:8080/api/v1/todos/1`

---

## Response Format

**Success Response (Create/Update/Get):**
```json
{
  "item_id": 1,
  "title": "Complete project",
  "description": "Finish the Spring Boot todo application",
  "is_completed": false
}
```

**Success Response (Get All - Paginated):**
```json
{
  "content": [
    {
      "item_id": 1,
      "title": "Todo 1",
      "description": "Description 1",
      "is_completed": false
    }
  ],
  "pageable": {...},
  "totalElements": 1,
  "totalPages": 1,
  "size": 10,
  "number": 0
}
```

**Error Response:**
```json
{
  "status": 404,
  "message": "Todo not found with id 999"
}
```

---

## H2 Console (Database Access)

You can also access the H2 database console at:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)


