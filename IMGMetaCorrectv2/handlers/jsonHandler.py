import json
import os

def get_json_content(json_file_path):
    try:
        with open(json_file_path, 'r') as file:
            json_data = json.load(file)
            return json_data
        
    except FileNotFoundError:
        print(f"JSON file not found: {json_file_path}")
        return None
    except json.JSONDecodeError:
        print(f"Invalid JSON format in: {json_file_path}")
        return None

def print_json_content(json_file_path):
    json_data = get_json_content(json_file_path)
    if json_data:
        print("JSON Content:")
        print(json.dumps(json_data, indent=4))

if __name__ == '__main__':
    # You can test the function here
    json_file_path = os.path.join(os.path.dirname(os.path.abspath(__file__)), '../samplerTool/jsonFiles/sampleJson.json')  # Provide the actual path to your JSON file
    print_json_content(json_file_path)